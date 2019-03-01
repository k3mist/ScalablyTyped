package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeExample extends js.Object {
  var config: java.lang.String
  var description: java.lang.String
  var fail: js.UndefOr[java.lang.String] = js.undefined
  var pass: java.lang.String
}

object ICodeExample {
  @scala.inline
  def apply(
    config: java.lang.String,
    description: java.lang.String,
    pass: java.lang.String,
    fail: java.lang.String = null
  ): ICodeExample = {
    val __obj = js.Dynamic.literal(config = config, description = description, pass = pass)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[ICodeExample]
  }
}

