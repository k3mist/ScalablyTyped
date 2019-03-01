package typings
package knockoutDashAmdDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutAMDModule extends js.Object {
  var baseDir: java.lang.String
  var disposeMethod: java.lang.String
  var initializer: java.lang.String
  var templateProperty: java.lang.String
}

object KnockoutAMDModule {
  @scala.inline
  def apply(
    baseDir: java.lang.String,
    disposeMethod: java.lang.String,
    initializer: java.lang.String,
    templateProperty: java.lang.String
  ): KnockoutAMDModule = {
    val __obj = js.Dynamic.literal(baseDir = baseDir, disposeMethod = disposeMethod, initializer = initializer, templateProperty = templateProperty)
  
    __obj.asInstanceOf[KnockoutAMDModule]
  }
}

