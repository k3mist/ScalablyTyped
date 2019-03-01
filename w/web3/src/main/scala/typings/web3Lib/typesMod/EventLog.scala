package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLog extends js.Object {
  var address: java.lang.String
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var event: java.lang.String
  var logIndex: scala.Double
  var raw: js.UndefOr[web3Lib.Anon_Data] = js.undefined
  var returnValues: js.Any
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double
}

object EventLog {
  @scala.inline
  def apply(
    address: java.lang.String,
    blockHash: java.lang.String,
    blockNumber: scala.Double,
    event: java.lang.String,
    logIndex: scala.Double,
    returnValues: js.Any,
    transactionHash: java.lang.String,
    transactionIndex: scala.Double,
    raw: web3Lib.Anon_Data = null
  ): EventLog = {
    val __obj = js.Dynamic.literal(address = address, blockHash = blockHash, blockNumber = blockNumber, event = event, logIndex = logIndex, returnValues = returnValues, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[EventLog]
  }
}

