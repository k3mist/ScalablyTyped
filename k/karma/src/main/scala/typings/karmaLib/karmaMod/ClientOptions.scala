package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * @default undefined
    * @description When karma run is passed additional arguments on the command-line, they
    * are passed through to the test adapter as karma.config.args (an array of strings).
    * The client.args option allows you to set this value for actions other than run.
    * How this value is used is up to your test adapter - you should check your adapter's
    * documentation to see how (and if) it uses this value.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * @default true
    * @description Capture all console output and pipe it to the terminal.
    */
  var captureConsole: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    * @description Clear the context window
    * If true, Karma clears the context window upon the completion of running the tests.
    * If false, Karma does not clear the context window upon the completion of running the tests.
    * Setting this to false is useful when embedding a Jasmine Spec Runner Template.
    */
  var clearContext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    * @description Run the tests on the same window as the client, without using iframe or a new window
    */
  var runInParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    * @description Run the tests inside an iFrame or a new window
    * If true, Karma runs the tests inside an iFrame. If false, Karma runs the tests in a new window. Some tests may not run in an
    * iFrame and may need a new window to run.
    */
  var useIframe: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    captureConsole: js.UndefOr[scala.Boolean] = js.undefined,
    clearContext: js.UndefOr[scala.Boolean] = js.undefined,
    runInParent: js.UndefOr[scala.Boolean] = js.undefined,
    useIframe: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(captureConsole)) __obj.updateDynamic("captureConsole")(captureConsole)
    if (!js.isUndefined(clearContext)) __obj.updateDynamic("clearContext")(clearContext)
    if (!js.isUndefined(runInParent)) __obj.updateDynamic("runInParent")(runInParent)
    if (!js.isUndefined(useIframe)) __obj.updateDynamic("useIframe")(useIframe)
    __obj.asInstanceOf[ClientOptions]
  }
}

