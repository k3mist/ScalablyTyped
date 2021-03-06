package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddTemplate extends js.Object {
  def addTemplate(templateName: java.lang.String, templateMarkup: java.lang.String): scala.Unit
  def createJavaScriptEvaluatorBlock(script: java.lang.String): java.lang.String
  def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[stdLib.Node]
}

object Anon_AddTemplate {
  @scala.inline
  def apply(
    addTemplate: (java.lang.String, java.lang.String) => scala.Unit,
    createJavaScriptEvaluatorBlock: java.lang.String => java.lang.String,
    renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[stdLib.Node]
  ): Anon_AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
  
    __obj.asInstanceOf[Anon_AddTemplate]
  }
}

