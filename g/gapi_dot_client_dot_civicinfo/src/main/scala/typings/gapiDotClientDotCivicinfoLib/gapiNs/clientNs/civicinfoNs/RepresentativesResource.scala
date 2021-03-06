package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: gapiDotClientDotCivicinfoLib.Anon_AddressAlt): gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: gapiDotClientDotCivicinfoLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoData]
}

object RepresentativesResource {
  @scala.inline
  def apply(
    representativeInfoByAddress: gapiDotClientDotCivicinfoLib.Anon_AddressAlt => gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoResponse],
    representativeInfoByDivision: gapiDotClientDotCivicinfoLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoData]
  ): RepresentativesResource = {
    val __obj = js.Dynamic.literal(representativeInfoByAddress = js.Any.fromFunction1(representativeInfoByAddress), representativeInfoByDivision = js.Any.fromFunction1(representativeInfoByDivision))
  
    __obj.asInstanceOf[RepresentativesResource]
  }
}

