package typings
package atPulumiAwsLib.gameliftGameSessionQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueueArgs extends js.Object {
  /**
    * List of fleet/alias ARNs used by session queue for placing game sessions.
    */
  val destinations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Name of the session queue.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more policies used to choose fleet based on player latency. See below.
    */
  val playerLatencyPolicies: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[
          atPulumiAwsLib.Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds
        ]
      ]
    ]
  ] = js.undefined
  /**
    * Maximum time a game session request can remain in the queue.
    */
  val timeoutInSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object GameSessionQueueArgs {
  @scala.inline
  def apply(
    destinations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    playerLatencyPolicies: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[
          atPulumiAwsLib.Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds
        ]
      ]
    ] = null,
    timeoutInSeconds: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): GameSessionQueueArgs = {
    val __obj = js.Dynamic.literal()
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (playerLatencyPolicies != null) __obj.updateDynamic("playerLatencyPolicies")(playerLatencyPolicies.asInstanceOf[js.Any])
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueueArgs]
  }
}

