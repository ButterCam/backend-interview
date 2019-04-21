package com.bybutter.interview

class Bean(val id: String, val dependencies: Set<String>) {
    var initialized: Boolean = false
        private set

    private val dependentBeans = mutableMapOf<String, Bean>()

    fun fillDependency(bean: Bean) {
        if(!dependencies.contains(bean.id)){
            throw RuntimeException("Bean '${bean.id}' is not a dependency for '$id'.")
        }
        dependentBeans[bean.id] = bean
    }

    fun getDependency(id: String): Bean? {
        return dependentBeans[id]
    }

    fun dependenciesResolved() {
        val notResolved = dependencies.firstOrNull { !dependentBeans.containsKey(it) }
        if(notResolved != null){
            throw RuntimeException("Dependency '$notResolved' of '$id' not resolved.")
        }
    }

    fun initializing() {
        dependenciesResolved()
        val notInitializedDependency = dependentBeans.values.firstOrNull { !it.initialized }
        if(notInitializedDependency != null) {
            throw RuntimeException("Dependency '${notInitializedDependency.id}' of '$id' not initialized.")
        }
        initialized = true
    }

    fun verify(): Boolean {
        dependenciesResolved()
        return initialized
    }
}

interface Case6 {
    fun dependentResolve(beans: List<Bean>): Boolean
}