package typings
package pDashProgressLib.pDashProgressMod.pProgressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Number of concurrently pending promises.
    *
    * To run the promises in series, set it to 1.
    *
    * When this option is set, the first argument must be an array of
    * promise-returning functions.
    *
    * Minimum 1.
    *
    * @default {Infinity}
    */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(concurrency: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

