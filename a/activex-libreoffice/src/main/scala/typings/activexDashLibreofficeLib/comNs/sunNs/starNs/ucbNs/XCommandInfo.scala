package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to information on a set of commands.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XCommandInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * obtains information for all supported commands.
    * @returns a sequence with information for all supported commands.
    */
  val Commands: activexDashInteropLib.SafeArray[CommandInfo]
  /**
    * returns information for a specific command.
    * @param Handle specifies the handle of the requested command.
    * @returns the information for the requested command.
    * @throws UnsupportedCommandException if the command is not supported.
    */
  def getCommandInfoByHandle(Handle: scala.Double): CommandInfo
  /**
    * returns information for a specific command.
    * @param Name specifies the name of the requested command.
    * @returns the information for the requested command.
    * @throws UnsupportedCommandException if the command is not supported.
    */
  def getCommandInfoByName(Name: java.lang.String): CommandInfo
  /**
    * obtains information for all supported commands.
    * @returns a sequence with information for all supported commands.
    */
  def getCommands(): activexDashInteropLib.SafeArray[CommandInfo]
  /**
    * checks whether a specific command is supported.
    * @param Handle specifies the handle of the requested command.
    * @returns `TRUE` if a command with the specified handle is supported; otherwise `FALSE` is returned.
    */
  def hasCommandByHandle(Handle: scala.Double): scala.Boolean
  /**
    * checks whether a command specific is supported.
    * @param Name specifies the name of the requested command.
    * @returns `TRUE` if a command with the specified name is supported; otherwise `FALSE` is returned.
    */
  def hasCommandByName(Name: java.lang.String): scala.Boolean
}

object XCommandInfo {
  @scala.inline
  def apply(
    Commands: activexDashInteropLib.SafeArray[CommandInfo],
    acquire: js.Function0[scala.Unit],
    getCommandInfoByHandle: js.Function1[scala.Double, CommandInfo],
    getCommandInfoByName: js.Function1[java.lang.String, CommandInfo],
    getCommands: js.Function0[activexDashInteropLib.SafeArray[CommandInfo]],
    hasCommandByHandle: js.Function1[scala.Double, scala.Boolean],
    hasCommandByName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCommandInfo = {
    val __obj = js.Dynamic.literal(Commands = Commands, acquire = acquire, getCommandInfoByHandle = getCommandInfoByHandle, getCommandInfoByName = getCommandInfoByName, getCommands = getCommands, hasCommandByHandle = hasCommandByHandle, hasCommandByName = hasCommandByName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCommandInfo]
  }
}

