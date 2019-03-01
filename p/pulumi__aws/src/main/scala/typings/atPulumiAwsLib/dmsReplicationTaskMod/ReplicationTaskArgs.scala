package typings
package atPulumiAwsLib.dmsReplicationTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationTaskArgs extends js.Object {
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The replication task identifier.
    */
  val replicationTaskId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object ReplicationTaskArgs {
  @scala.inline
  def apply(
    migrationType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    replicationInstanceArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    replicationTaskId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    sourceEndpointArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    tableMappings: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    targetEndpointArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    cdcStartTime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    replicationTaskSettings: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ReplicationTaskArgs = {
    val __obj = js.Dynamic.literal(migrationType = migrationType.asInstanceOf[js.Any], replicationInstanceArn = replicationInstanceArn.asInstanceOf[js.Any], replicationTaskId = replicationTaskId.asInstanceOf[js.Any], sourceEndpointArn = sourceEndpointArn.asInstanceOf[js.Any], tableMappings = tableMappings.asInstanceOf[js.Any], targetEndpointArn = targetEndpointArn.asInstanceOf[js.Any])
    if (cdcStartTime != null) __obj.updateDynamic("cdcStartTime")(cdcStartTime.asInstanceOf[js.Any])
    if (replicationTaskSettings != null) __obj.updateDynamic("replicationTaskSettings")(replicationTaskSettings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskArgs]
  }
}

