package org.groopiter

import spock.lang.Specification

/**
 * Test for GroovyShellHandler
 */
class GroovyShellHandlerTest extends Specification {

    GroovyShellHandler groovyShellHandler

    void setup() {
        groovyShellHandler = new GroovyShellHandler()
    }

    def 'test simple code'() {
        when:
        String actual = groovyShellHandler.processGroovyCode(codeToProcess)

        then:
        actual == expected

        where:
        codeToProcess   | expected
        "return 'Dude'" | 'Dude'
        "return 1+2"    | '3'

    }
}
