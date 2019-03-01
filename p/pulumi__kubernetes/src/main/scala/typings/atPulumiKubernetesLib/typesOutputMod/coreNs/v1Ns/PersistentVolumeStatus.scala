package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeStatus is the current status of a persistent volume.
  */
trait PersistentVolumeStatus extends js.Object {
  /**
    * A human-readable message indicating details about why the volume is in this state.
    */
  val message: java.lang.String
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More
    * info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  val phase: java.lang.String
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine
    * parsing and tidy display in the CLI.
    */
  val reason: java.lang.String
}

object PersistentVolumeStatus {
  @scala.inline
  def apply(message: java.lang.String, phase: java.lang.String, reason: java.lang.String): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal(message = message, phase = phase, reason = reason)
  
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
}

