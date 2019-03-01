package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilObject extends js.Object {
  /**
  	 * Creates an empty object and copies all enumerable properties of another object to it
  	 * @param object Object to clone
  	 */
  def clone(`object`: js.Any): js.Any
  /**
  	 * Copies all enumerable properties of one object to another
  	 * @param destination Where to copy to
  	 * @param source Where to copy from
  	 */
  def extend(destination: js.Any, source: js.Any): js.Any
}

object IUtilObject {
  @scala.inline
  def apply(clone: js.Function1[js.Any, js.Any], extend: js.Function2[js.Any, js.Any, js.Any]): IUtilObject = {
    val __obj = js.Dynamic.literal(clone = clone, extend = extend)
  
    __obj.asInstanceOf[IUtilObject]
  }
}

