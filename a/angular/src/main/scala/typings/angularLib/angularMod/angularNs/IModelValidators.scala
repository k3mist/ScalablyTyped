package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelValidators
  extends /**
  * viewValue is any because it can be an object that is called in the view like $viewValue.name:$viewValue.subName
  */
/* index */ org.scalablytyped.runtime.StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, scala.Boolean]]

object IModelValidators {
  @scala.inline
  def apply(
    StringDictionary: /**
    * viewValue is any because it can be an object that is called in the view like $viewValue.name:$viewValue.subName
    */
  /* index */ org.scalablytyped.runtime.StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, scala.Boolean]] = null
  ): IModelValidators = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IModelValidators]
  }
}

