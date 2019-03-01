package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
trait ContainerStateTerminated extends js.Object {
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  val containerID: java.lang.String
  /**
    * Exit status from the last termination of the container
    */
  val exitCode: scala.Double
  /**
    * Time at which the container last terminated
    */
  val finishedAt: java.lang.String
  /**
    * Message regarding the last termination of the container
    */
  val message: java.lang.String
  /**
    * (brief) reason from the last termination of the container
    */
  val reason: java.lang.String
  /**
    * Signal from the last termination of the container
    */
  val signal: scala.Double
  /**
    * Time at which previous execution of the container started
    */
  val startedAt: java.lang.String
}

object ContainerStateTerminated {
  @scala.inline
  def apply(
    containerID: java.lang.String,
    exitCode: scala.Double,
    finishedAt: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    signal: scala.Double,
    startedAt: java.lang.String
  ): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(containerID = containerID, exitCode = exitCode, finishedAt = finishedAt, message = message, reason = reason, signal = signal, startedAt = startedAt)
  
    __obj.asInstanceOf[ContainerStateTerminated]
  }
}

