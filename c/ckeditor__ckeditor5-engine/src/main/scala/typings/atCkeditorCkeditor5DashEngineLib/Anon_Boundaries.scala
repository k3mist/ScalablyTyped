package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boundaries extends js.Object {
  var boundaries: js.UndefOr[atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range] = js.undefined
  var direction: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.TreeWalkerDirection
  ] = js.undefined
  var ignoreElementEnd: js.UndefOr[scala.Boolean] = js.undefined
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
  var singleCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var startPosition: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position
  ] = js.undefined
}

object Anon_Boundaries {
  @scala.inline
  def apply(
    boundaries: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range = null,
    direction: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.TreeWalkerDirection = null,
    ignoreElementEnd: js.UndefOr[scala.Boolean] = js.undefined,
    shallow: js.UndefOr[scala.Boolean] = js.undefined,
    singleCharacters: js.UndefOr[scala.Boolean] = js.undefined,
    startPosition: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position = null
  ): Anon_Boundaries = {
    val __obj = js.Dynamic.literal()
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(ignoreElementEnd)) __obj.updateDynamic("ignoreElementEnd")(ignoreElementEnd)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    if (!js.isUndefined(singleCharacters)) __obj.updateDynamic("singleCharacters")(singleCharacters)
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition)
    __obj.asInstanceOf[Anon_Boundaries]
  }
}

