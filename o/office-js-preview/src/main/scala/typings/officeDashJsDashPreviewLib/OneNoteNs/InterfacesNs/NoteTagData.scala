package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "noteTag.toJSON()". */
trait NoteTagData extends js.Object {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    officeDashJsDashPreviewLib.OneNoteNs.NoteTagStatus | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Normal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Completed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Disabled | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OutlookTask | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TaskNotSyncedYet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TaskRemoved
  ] = js.undefined
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.OneNoteNs.NoteTagType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Important | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Question | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Contact | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Address | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PhoneNumber | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Website | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Idea | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Critical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDoPriority1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDoPriority2
  ] = js.undefined
}

object NoteTagData {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    status: officeDashJsDashPreviewLib.OneNoteNs.NoteTagStatus | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Normal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Completed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Disabled | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OutlookTask | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TaskNotSyncedYet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TaskRemoved = null,
    `type`: officeDashJsDashPreviewLib.OneNoteNs.NoteTagType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Important | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Question | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Contact | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Address | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PhoneNumber | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Website | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Idea | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Critical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDoPriority1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDoPriority2 = null
  ): NoteTagData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteTagData]
  }
}

