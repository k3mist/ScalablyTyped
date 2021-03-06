package typings
package nomnomLib.NomnomInternalNs.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * The name of the command.
    */
  var name: java.lang.String
  /**
    * Sets a callback for the command.
    * @param func The callback function.
    * @returns The command.
    */
  def callback(func: js.Function1[/* options */ js.Any, scala.Unit]): Command
  /**
    * Sets the help string for the command.
    * @param help The help string.
    * @returns The command.
    */
  def help(help: java.lang.String): Command
  /**
    * Sets an option of the command.
    * @param name The name of the option.
    * @param spec The specifiction of the option.
    * @returns The command.
    */
  def option(name: java.lang.String, spec: Option): Command
  /**
    * Sets the options of the command.
    * @param specs The specifications of the options.
    * @returns The command.
    */
  def options(specs: org.scalablytyped.runtime.StringDictionary[Option]): Command
  /**
    * Sets the usage string for the command.
    * @param usage The usage string.
    * @returns The command.
    */
  def usage(usage: java.lang.String): Command
}

object Command {
  @scala.inline
  def apply(
    callback: js.Function1[/* options */ js.Any, scala.Unit] => Command,
    help: java.lang.String => Command,
    name: java.lang.String,
    option: (java.lang.String, Option) => Command,
    options: org.scalablytyped.runtime.StringDictionary[Option] => Command,
    usage: java.lang.String => Command
  ): Command = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), help = js.Any.fromFunction1(help), name = name, option = js.Any.fromFunction2(option), options = js.Any.fromFunction1(options), usage = js.Any.fromFunction1(usage))
  
    __obj.asInstanceOf[Command]
  }
}

