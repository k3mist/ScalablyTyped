package typings
package atomDashMochaDashTestDashRunnerLib.atomDashMochaDashTestDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtomMochaOptions extends js.Object {
  /** Whether or not to colorize output on the terminal. */
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to assign the created Atom environment to `global.atom`. */
  var globalAtom: js.UndefOr[scala.Boolean] = js.undefined
  /** The string to use for the window title in the HTML reporter. */
  var htmlTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Which reporter to use on the terminal. */
  var reporter: js.UndefOr[java.lang.String] = js.undefined
  /** File extensions that indicate that the file contains tests. */
  var testSuffixes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AtomMochaOptions {
  @scala.inline
  def apply(
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    globalAtom: js.UndefOr[scala.Boolean] = js.undefined,
    htmlTitle: java.lang.String = null,
    reporter: java.lang.String = null,
    testSuffixes: js.Array[java.lang.String] = null
  ): AtomMochaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(globalAtom)) __obj.updateDynamic("globalAtom")(globalAtom)
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (testSuffixes != null) __obj.updateDynamic("testSuffixes")(testSuffixes)
    __obj.asInstanceOf[AtomMochaOptions]
  }
}

