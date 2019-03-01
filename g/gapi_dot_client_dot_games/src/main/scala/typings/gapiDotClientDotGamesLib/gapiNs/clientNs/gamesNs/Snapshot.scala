package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /** The cover image of this snapshot. May be absent if there is no image. */
  var coverImage: js.UndefOr[SnapshotImage] = js.undefined
  /** The description of this snapshot. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the file underlying this snapshot in the Drive API. Only present if the snapshot is a view on a Drive file and the file is owned by the
    * caller.
    */
  var driveId: js.UndefOr[java.lang.String] = js.undefined
  /** The duration associated with this snapshot, in millis. */
  var durationMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the snapshot. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#snapshot. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp (in millis since Unix epoch) of the last modification to this snapshot. */
  var lastModifiedMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The progress value (64-bit integer set by developer) associated with this snapshot. */
  var progressValue: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this snapshot. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of this snapshot.
    * Possible values are:
    * - "SAVE_GAME" - A snapshot representing a save game.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The unique name provided when the snapshot was created. */
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object Snapshot {
  @scala.inline
  def apply(
    coverImage: SnapshotImage = null,
    description: java.lang.String = null,
    driveId: java.lang.String = null,
    durationMillis: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedMillis: java.lang.String = null,
    progressValue: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    uniqueName: java.lang.String = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (coverImage != null) __obj.updateDynamic("coverImage")(coverImage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (driveId != null) __obj.updateDynamic("driveId")(driveId)
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedMillis != null) __obj.updateDynamic("lastModifiedMillis")(lastModifiedMillis)
    if (progressValue != null) __obj.updateDynamic("progressValue")(progressValue)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[Snapshot]
  }
}

