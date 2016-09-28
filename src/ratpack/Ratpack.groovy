import ratpack.groovy.template.MarkupTemplateModule

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack
import  org.groopiter.GroovyShellHandler


ratpack {
  bindings {
    module MarkupTemplateModule
  }

  handlers {
    get {
      render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
    }
    get ('shell'){
      def script = ''' 
new File('/etc/passwd').text
      '''
      def gsh = new  GroovyShellHandler()
      render gsh.processGroovyCode(script)
    }

    files { dir "public" }
  }
}
