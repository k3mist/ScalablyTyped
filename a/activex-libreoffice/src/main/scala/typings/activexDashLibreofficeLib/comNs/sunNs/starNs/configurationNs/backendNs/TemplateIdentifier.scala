package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds the data needed to identify a template.
  * @since OOo 1.1.2
  */
trait TemplateIdentifier extends js.Object {
  /** specifies the component where the template originates. */
  var Component: java.lang.String
  /**
    * specifies the name of the template.
    *
    * The name is unique within a component.
    */
  var Name: java.lang.String
}

object TemplateIdentifier {
  @scala.inline
  def apply(Component: java.lang.String, Name: java.lang.String): TemplateIdentifier = {
    val __obj = js.Dynamic.literal(Component = Component, Name = Name)
  
    __obj.asInstanceOf[TemplateIdentifier]
  }
}

