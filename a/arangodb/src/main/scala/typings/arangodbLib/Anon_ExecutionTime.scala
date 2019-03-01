package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExecutionTime extends js.Object {
  var executionTime: scala.Double
  var filtered: scala.Double
  var fullCount: scala.Double
  var httpRequests: scala.Double
  var scannedFull: scala.Double
  var scannedIndex: scala.Double
  var writesExecuted: scala.Double
  var writesIgnored: scala.Double
}

object Anon_ExecutionTime {
  @scala.inline
  def apply(
    executionTime: scala.Double,
    filtered: scala.Double,
    fullCount: scala.Double,
    httpRequests: scala.Double,
    scannedFull: scala.Double,
    scannedIndex: scala.Double,
    writesExecuted: scala.Double,
    writesIgnored: scala.Double
  ): Anon_ExecutionTime = {
    val __obj = js.Dynamic.literal(executionTime = executionTime, filtered = filtered, fullCount = fullCount, httpRequests = httpRequests, scannedFull = scannedFull, scannedIndex = scannedIndex, writesExecuted = writesExecuted, writesIgnored = writesIgnored)
  
    __obj.asInstanceOf[Anon_ExecutionTime]
  }
}

