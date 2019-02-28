package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Object of option names and values
	 *
	 * @param [options.kind='']
	 *        A valid audio track kind
	 *
	 * @param [options.id='vjs_track_' + Guid.newGUID()]
	 *        A unique id for this AudioTrack.
	 *
	 * @param [options.label='']
	 *        The menu label for this track.
	 *
	 * @param [options.language='']
	 *        A valid two character language code.
	 *
	 * @param [options.enabled]
	 *        If this track is the one that is currently playing. If this track is part of
	 *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
	 */
trait AudioTrackOptions extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackNs.Kind] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
}

