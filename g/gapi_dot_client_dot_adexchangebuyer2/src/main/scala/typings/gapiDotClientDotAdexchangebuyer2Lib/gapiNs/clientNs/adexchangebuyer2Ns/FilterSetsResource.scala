package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSetsResource extends js.Object {
  var bidMetrics: BidMetricsResource
  var bidResponseErrors: BidResponseErrorsResource
  var bidResponsesWithoutBids: BidResponsesWithoutBidsResource
  var filteredBidRequests: FilteredBidRequestsResource
  var filteredBids: FilteredBidsResource
  var impressionMetrics: ImpressionMetricsResource
  var losingBids: LosingBidsResource
  var nonBillableWinningBids: NonBillableWinningBidsResource
  /** Creates the specified filter set for the account with the given account ID. */
  def create(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsIsTransient
  ): gapiDotClientLib.gapiNs.clientNs.Request[FilterSet]
  /**
    * Deletes the requested filter set from the account with the given account
    * ID.
    */
  def delete(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Retrieves the requested filter set for the account with the given account
    * ID.
    */
  def get(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[FilterSet]
  /** Lists all filter sets for the account with the given account ID. */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListFilterSetsResponse]
}

object FilterSetsResource {
  @scala.inline
  def apply(
    bidMetrics: BidMetricsResource,
    bidResponseErrors: BidResponseErrorsResource,
    bidResponsesWithoutBids: BidResponsesWithoutBidsResource,
    create: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsIsTransient, 
      gapiDotClientLib.gapiNs.clientNs.Request[FilterSet]
    ],
    delete: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    filteredBidRequests: FilteredBidRequestsResource,
    filteredBids: FilteredBidsResource,
    get: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[FilterSet]
    ],
    impressionMetrics: ImpressionMetricsResource,
    list: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListFilterSetsResponse]
    ],
    losingBids: LosingBidsResource,
    nonBillableWinningBids: NonBillableWinningBidsResource
  ): FilterSetsResource = {
    val __obj = js.Dynamic.literal(bidMetrics = bidMetrics, bidResponseErrors = bidResponseErrors, bidResponsesWithoutBids = bidResponsesWithoutBids, create = create, delete = delete, filteredBidRequests = filteredBidRequests, filteredBids = filteredBids, get = get, impressionMetrics = impressionMetrics, list = list, losingBids = losingBids, nonBillableWinningBids = nonBillableWinningBids)
  
    __obj.asInstanceOf[FilterSetsResource]
  }
}

