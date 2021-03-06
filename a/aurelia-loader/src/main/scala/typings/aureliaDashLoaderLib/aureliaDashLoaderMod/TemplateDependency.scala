package typings
package aureliaDashLoaderLib.aureliaDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-loader", "TemplateDependency")
@js.native
class TemplateDependency protected () extends js.Object {
  /**
    * Creates a template dependency.
    * @param src The source of the dependency.
    * @param name The local name of the src when used in the template.
    */
  def this(src: java.lang.String) = this()
  def this(src: java.lang.String, name: java.lang.String) = this()
  /**
    * The local name of the src when used in the template.
    */
  var name: java.lang.String = js.native
  /**
    * The source of the dependency.
    */
  var src: java.lang.String = js.native
}

