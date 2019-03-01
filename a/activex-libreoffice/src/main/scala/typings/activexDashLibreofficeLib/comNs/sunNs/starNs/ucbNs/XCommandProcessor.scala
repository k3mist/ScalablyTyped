package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a processor for synchronous commands, which are executed in a specific execution environment.
  * @author Kai Sommerfeld
  * @see com.sun.star.ucb.XCommandProcessor2 for the improved version of this interface.
  * @see Command
  * @see XCommandEnvironment
  * @see XContent
  * @version 1.0
  */
trait XCommandProcessor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * ends the command associated with the given id.
    *
    * Not every command can be aborted. It's up to the implementation to decide whether this method will actually end the processing of the command or
    * simply do nothing.
    * @param CommandId is a unique id for the command to abort. This must be the identifier passed to {@link XCommandProcessor.execute()} for the command to abort.
    */
  def abort(CommandId: scala.Double): scala.Unit
  /**
    * creates a unique identifier for a command.
    *
    * This identifier can be used to abort the execution of the command associated with that identifier. Note that it is generally not necessary to obtain a
    * new id for each command, because commands are executed synchronously. So the id for a command is valid again after a command previously associated
    * with this id has finished. In fact you only should get one identifier per thread and assign it to every command executed by that thread.
    *
    * Also, after a call to {@link XCommandProcessor.abort()} , an identifier should not be used any longer (and instead be released by a call to {@link
    * XCommandProcessor2.releaseCommandIdentifier()} ), because it may well abort **all** further calls to {@link XCommandProcessor.execute()} .
    *
    * To avoid ever-increasing resource consumption, the identifier should be released via {@link XCommandProcessor2.releaseCommandIdentifier()} when it is
    * no longer used.
    * @returns a command identifier.
    */
  def createCommandIdentifier(): scala.Double
  /**
    * executes a command.
    *
    * Common command definitions can be found in the specification of the service {@link Content} .
    * @param aCommand is the command to execute.
    * @param CommandId is a unique id for the command. This identifier was obtained by calling {@link XCommandProcessor.createCommandIdentifier()} . A value o
    * @param Environment is the execution environment.
    * @returns the result according to the specification of the command.
    * @throws CommandAbortedException to indicate that the command was aborted.
    * @throws DuplicateCommandIdentifierException to indicate that two threads tried to use the same command identifier
    * @throws Exception if an error occurred during the execution of the command.
    */
  def execute(aCommand: Command, CommandId: scala.Double, Environment: XCommandEnvironment): js.Any
}

object XCommandProcessor {
  @scala.inline
  def apply(
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    createCommandIdentifier: js.Function0[scala.Double],
    execute: js.Function3[Command, scala.Double, XCommandEnvironment, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCommandProcessor = {
    val __obj = js.Dynamic.literal(abort = abort, acquire = acquire, createCommandIdentifier = createCommandIdentifier, execute = execute, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCommandProcessor]
  }
}

