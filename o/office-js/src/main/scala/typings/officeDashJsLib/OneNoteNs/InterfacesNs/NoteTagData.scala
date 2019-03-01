package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

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
    officeDashJsLib.OneNoteNs.NoteTagStatus | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Normal | officeDashJsLib.officeDashJsLibStrings.Completed | officeDashJsLib.officeDashJsLibStrings.Disabled | officeDashJsLib.officeDashJsLibStrings.OutlookTask | officeDashJsLib.officeDashJsLibStrings.TaskNotSyncedYet | officeDashJsLib.officeDashJsLibStrings.TaskRemoved
  ] = js.undefined
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.OneNoteNs.NoteTagType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2
  ] = js.undefined
}

object NoteTagData {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    status: officeDashJsLib.OneNoteNs.NoteTagStatus | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Normal | officeDashJsLib.officeDashJsLibStrings.Completed | officeDashJsLib.officeDashJsLibStrings.Disabled | officeDashJsLib.officeDashJsLibStrings.OutlookTask | officeDashJsLib.officeDashJsLibStrings.TaskNotSyncedYet | officeDashJsLib.officeDashJsLibStrings.TaskRemoved = null,
    `type`: officeDashJsLib.OneNoteNs.NoteTagType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2 = null
  ): NoteTagData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteTagData]
  }
}

