package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterTransform extends js.Object {
  var needTransform: scala.Boolean
  var transforming: scala.Boolean
  var writecb: (js.Function1[/* err */ js.Any, _]) | scala.Null
  var writechunk: js.Any
   // TODO
  var writeencoding: java.lang.String | scala.Null
  def afterTransform(
    `this`: readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform,
    er: js.Any,
    data: js.Any
  ): scala.Unit | scala.Boolean
}

object Anon_AfterTransform {
  @scala.inline
  def apply(
    afterTransform: js.Function3[
      readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      js.Any, 
      js.Any, 
      scala.Unit | scala.Boolean
    ],
    needTransform: scala.Boolean,
    transforming: scala.Boolean,
    writechunk: js.Any,
    writecb: js.Function1[/* err */ js.Any, _] = null,
    writeencoding: java.lang.String = null
  ): Anon_AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = afterTransform, needTransform = needTransform, transforming = transforming, writechunk = writechunk)
    if (writecb != null) __obj.updateDynamic("writecb")(writecb)
    if (writeencoding != null) __obj.updateDynamic("writeencoding")(writeencoding)
    __obj.asInstanceOf[Anon_AfterTransform]
  }
}

