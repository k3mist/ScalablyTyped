package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationRegionGrantName extends js.Object {
  var destinationRegion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var grantName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var retentionPeriod: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_DestinationRegionGrantName {
  @scala.inline
  def apply(
    destinationRegion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    grantName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    retentionPeriod: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_DestinationRegionGrantName = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
    if (grantName != null) __obj.updateDynamic("grantName")(grantName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationRegionGrantName]
  }
}

