package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICPU extends js.Object {
  /**
    * Possible architecture:
    *  68k, amd64, arm, arm64, avr, ia32, ia64, irix, irix64, mips, mips64, pa-risc,
    *  ppc, sparc, sparc64
    */
  var architecture: js.UndefOr[java.lang.String]
}

object ICPU {
  @scala.inline
  def apply(architecture: java.lang.String = null): ICPU = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture)
    __obj.asInstanceOf[ICPU]
  }
}

