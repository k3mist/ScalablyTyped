package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait WithTranslation extends js.Object {
  var i18n: i18nextLib.i18nextMod.i18nextNs.i18n
}

object WithTranslation {
  @scala.inline
  def apply(i18n: i18nextLib.i18nextMod.i18nextNs.i18n): WithTranslation = {
    val __obj = js.Dynamic.literal(i18n = i18n)
  
    __obj.asInstanceOf[WithTranslation]
  }
}

