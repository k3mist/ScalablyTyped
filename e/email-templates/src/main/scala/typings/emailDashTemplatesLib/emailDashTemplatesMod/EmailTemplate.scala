package typings
package emailDashTemplatesLib.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplate extends js.Object {
  /**
    *   shorthand use of `juiceResources` with the config
    *   mainly for custom renders like from a database).
    */
  def juiceResources(html: java.lang.String): js.Promise[java.lang.String]
  /**
    *
    * @param view The Html pug to render
    * @param locals The template Variables
    */
  def render(view: java.lang.String, locals: js.Any): js.Promise[java.lang.String]
  /**
    * Send the Email
    */
  def send(options: EmailOptions): js.Any
}

object EmailTemplate {
  @scala.inline
  def apply(
    juiceResources: java.lang.String => js.Promise[java.lang.String],
    render: (java.lang.String, js.Any) => js.Promise[java.lang.String],
    send: EmailOptions => js.Any
  ): EmailTemplate = {
    val __obj = js.Dynamic.literal(juiceResources = js.Any.fromFunction1(juiceResources), render = js.Any.fromFunction2(render), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[EmailTemplate]
  }
}

