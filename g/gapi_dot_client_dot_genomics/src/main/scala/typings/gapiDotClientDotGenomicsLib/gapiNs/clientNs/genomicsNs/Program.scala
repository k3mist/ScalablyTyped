package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends js.Object {
  /** The command line used to run this program. */
  var commandLine: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user specified locally unique ID of the program. Used along with
    * `prevProgramId` to define an ordering between programs.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The display name of the program. This is typically the colloquial name of
    * the tool used, for example 'bwa' or 'picard'.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the program run before this one. */
  var prevProgramId: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the program run. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Program {
  @scala.inline
  def apply(
    commandLine: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    prevProgramId: java.lang.String = null,
    version: java.lang.String = null
  ): Program = {
    val __obj = js.Dynamic.literal()
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prevProgramId != null) __obj.updateDynamic("prevProgramId")(prevProgramId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Program]
  }
}

