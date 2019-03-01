package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticWithLocation extends Diagnostic {
  @JSName("file")
  var file_DiagnosticWithLocation: SourceFile
  @JSName("length")
  var length_DiagnosticWithLocation: scala.Double
  @JSName("start")
  var start_DiagnosticWithLocation: scala.Double
}

object DiagnosticWithLocation {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: scala.Double,
    file: SourceFile,
    length: scala.Double,
    messageText: java.lang.String | DiagnosticMessageChain,
    start: scala.Double,
    relatedInformation: js.Array[DiagnosticRelatedInformation] = null,
    reportsUnnecessary: js.Object = null,
    source: java.lang.String = null
  ): DiagnosticWithLocation = {
    val __obj = js.Dynamic.literal(category = category, code = code, file = file, length = length, messageText = messageText.asInstanceOf[js.Any], start = start)
    if (relatedInformation != null) __obj.updateDynamic("relatedInformation")(relatedInformation)
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[DiagnosticWithLocation]
  }
}

