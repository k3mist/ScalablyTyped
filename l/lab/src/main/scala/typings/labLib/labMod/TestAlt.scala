package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAlt extends js.Object {
  var it: SkipOnlyTest
  var test: SkipOnlyTest
}

object TestAlt {
  @scala.inline
  def apply(it: SkipOnlyTest, test: SkipOnlyTest): TestAlt = {
    val __obj = js.Dynamic.literal(it = it, test = test)
  
    __obj.asInstanceOf[TestAlt]
  }
}

