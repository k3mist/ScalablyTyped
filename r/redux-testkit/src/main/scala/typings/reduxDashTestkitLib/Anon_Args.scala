package typings
package reduxDashTestkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def execute(state: js.Any, args: js.Any*): js.Any
  def expect(state: js.Any, args: js.Any*): Anon_ExpectedToReturn
}

object Anon_Args {
  @scala.inline
  def apply(
    execute: js.Function2[js.Any, /* repeated */ js.Any, js.Any],
    expect: js.Function2[js.Any, /* repeated */ js.Any, Anon_ExpectedToReturn]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(execute = execute, expect = expect)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

