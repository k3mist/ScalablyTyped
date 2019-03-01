package typings
package urlDashRegexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exact extends js.Object {
  /** Only match an exact string. Useful with RegExp#test to check if a string is a URL. */
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  /** Force URLs to start with a valid protocol or www. If set to false it'll match the TLD against a list of valid TLDs(https://github.com/stephenmathieson/node-tlds). */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Exact {
  @scala.inline
  def apply(exact: js.UndefOr[scala.Boolean] = js.undefined, strict: js.UndefOr[scala.Boolean] = js.undefined): Anon_Exact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Exact]
  }
}

