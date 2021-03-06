package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NoteTagStatus extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagStatus")
@js.native
object NoteTagStatus extends js.Object {
  @js.native
  sealed trait completed
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  @js.native
  sealed trait disabled
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  @js.native
  sealed trait normal
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  @js.native
  sealed trait outlookTask
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  @js.native
  sealed trait taskNotSyncedYet
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  @js.native
  sealed trait taskRemoved
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  @js.native
  sealed trait unknown
    extends officeDashJsLib.OneNoteNs.NoteTagStatus
  
  /* "Completed" */ val completed: completed with java.lang.String = js.native
  /* "Disabled" */ val disabled: disabled with java.lang.String = js.native
  /* "Normal" */ val normal: normal with java.lang.String = js.native
  /* "OutlookTask" */ val outlookTask: outlookTask with java.lang.String = js.native
  /* "TaskNotSyncedYet" */ val taskNotSyncedYet: taskNotSyncedYet with java.lang.String = js.native
  /* "TaskRemoved" */ val taskRemoved: taskRemoved with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OneNoteNs.NoteTagStatus with java.lang.String] = js.native
}

