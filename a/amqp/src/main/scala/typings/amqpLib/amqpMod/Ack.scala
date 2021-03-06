package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends DeliveryInfo {
  def acknowledge(all: scala.Boolean): scala.Unit
  def reject(requeue: scala.Boolean): scala.Unit
}

object Ack {
  @scala.inline
  def apply(
    acknowledge: scala.Boolean => scala.Unit,
    consumerTag: java.lang.String,
    contentType: java.lang.String,
    deliveryTag: stdLib.Uint8Array,
    exchange: java.lang.String,
    queue: java.lang.String,
    redelivered: scala.Boolean,
    reject: scala.Boolean => scala.Unit,
    routingKey: java.lang.String
  ): Ack = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), consumerTag = consumerTag, contentType = contentType, deliveryTag = deliveryTag, exchange = exchange, queue = queue, redelivered = redelivered, reject = js.Any.fromFunction1(reject), routingKey = routingKey)
  
    __obj.asInstanceOf[Ack]
  }
}

