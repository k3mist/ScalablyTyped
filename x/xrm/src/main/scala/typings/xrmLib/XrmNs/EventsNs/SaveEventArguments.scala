package typings
package xrmLib.XrmNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for save event arguments.
  */
trait SaveEventArguments extends js.Object {
  /**
    * @summary Gets save mode, as an integer.
    * @returns The save mode.
    * @description Gets save mode, as an integer.<BR>
    * **Values returned are**:
    * * 1      Save
    * * 2      Save and Close
    * * 59     Save and New
    * * 70     AutoSave (Where enabled; can be used with an OnSave handler to conditionally disable auto-saving)
    * * 58     Save as Completed (Activities)
    * * 5      Deactivate
    * * 6      Reactivate
    * * 47     Assign (All user- or team-owned entities)
    * * 7      Send (Email)
    * * 16     Qualify (Lead)
    * * 15     Disqualify (Lead)
    */
  def getSaveMode(): xrmLib.XrmEnumNs.SaveMode
  /**
    * Returns a boolean value to indicate if the record's save has been prevented.
    * @returns true if saving is prevented, otherwise false.
    */
  def isDefaultPrevented(): scala.Boolean
  /**
    * Prevents the save operation from being submitted to the server.
    * All remaining "on save" handlers will continue execution.
    */
  def preventDefault(): scala.Unit
}

object SaveEventArguments {
  @scala.inline
  def apply(
    getSaveMode: js.Function0[xrmLib.XrmEnumNs.SaveMode],
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit]
  ): SaveEventArguments = {
    val __obj = js.Dynamic.literal(getSaveMode = getSaveMode, isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault)
  
    __obj.asInstanceOf[SaveEventArguments]
  }
}

