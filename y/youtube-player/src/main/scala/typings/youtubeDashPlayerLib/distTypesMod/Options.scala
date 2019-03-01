package typings
package youtubeDashPlayerLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var events: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]: (event : std.CustomEvent<any>): void}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]: (event : std.CustomEvent<any>): void}
    */ youtubeDashPlayerLib.youtubeDashPlayerLibStrings.Options with js.Any
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var playerVars: js.UndefOr[youtubeDashPlayerLib.Anon_0] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    events: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]: (event : std.CustomEvent<any>): void}
    */ youtubeDashPlayerLib.youtubeDashPlayerLibStrings.Options with js.Any = null,
    height: scala.Int | scala.Double = null,
    playerVars: youtubeDashPlayerLib.Anon_0 = null,
    videoId: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (playerVars != null) __obj.updateDynamic("playerVars")(playerVars)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

