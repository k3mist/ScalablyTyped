package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "ProgressPlugin")
@js.native
class ProgressPlugin ()
  extends webpackLib.webpackMod.webpackNs.ProgressPlugin {
  def this(options: js.Function5[
      /* percentage */ scala.Double, 
      /* msg */ java.lang.String, 
      /* moduleProgress */ js.UndefOr[java.lang.String], 
      /* activeModules */ js.UndefOr[java.lang.String], 
      /* moduleName */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]) = this()
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
}

