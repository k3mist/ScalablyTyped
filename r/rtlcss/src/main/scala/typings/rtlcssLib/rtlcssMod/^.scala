package typings
package rtlcssLib.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rtlcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(config: rtlcssLib.rtlcssMod.ConfigOptions): js.Object = js.native
  def process(css: java.lang.String): java.lang.String = js.native
  def process(css: java.lang.String, options: js.Object): java.lang.String = js.native
  def process(css: java.lang.String, options: js.Object, plugins: js.Array[java.lang.String]): java.lang.String = js.native
  def process(
    css: java.lang.String,
    options: js.Object,
    plugins: js.Array[java.lang.String],
    hooks: rtlcssLib.rtlcssMod.HookOptions
  ): java.lang.String = js.native
  def process(css: java.lang.String, options: js.Object, plugins: js.Object): java.lang.String = js.native
  def process(
    css: java.lang.String,
    options: js.Object,
    plugins: js.Object,
    hooks: rtlcssLib.rtlcssMod.HookOptions
  ): java.lang.String = js.native
}

