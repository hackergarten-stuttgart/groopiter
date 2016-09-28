package org.groopiter

/**
 *
 */
class GroovyShellHandler {

    String processGroovyCode(String codeToProcess) {
        GroovyShell shell = new GroovyShell(GroovyShellHandler.classLoader)
        return shell.evaluate(codeToProcess)
    }
}
