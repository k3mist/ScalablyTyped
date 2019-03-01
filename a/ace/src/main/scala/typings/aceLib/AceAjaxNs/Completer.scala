package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completer extends js.Object {
  /**
    * Provides tooltip information about a completion result.
    * @param item The completion result
    */
  var getDocTooltip: js.UndefOr[js.Function1[/* item */ Completion, scala.Unit]] = js.undefined
  /**
    * Provides possible completion results asynchronously using the given callback.
    * @param editor The editor to associate with
    * @param session The `EditSession` to refer to
    * @param pos An object containing the row and column
    * @param prefix The prefixing string before the current position
    * @param callback Function to provide the results or error
    */
  def getCompletions(
    editor: Editor,
    session: IEditSession,
    pos: Position,
    prefix: java.lang.String,
    callback: CompletionCallback
  ): scala.Unit
}

object Completer {
  @scala.inline
  def apply(
    getCompletions: js.Function5[Editor, IEditSession, Position, java.lang.String, CompletionCallback, scala.Unit],
    getDocTooltip: js.Function1[/* item */ Completion, scala.Unit] = null
  ): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = getCompletions)
    if (getDocTooltip != null) __obj.updateDynamic("getDocTooltip")(getDocTooltip)
    __obj.asInstanceOf[Completer]
  }
}

