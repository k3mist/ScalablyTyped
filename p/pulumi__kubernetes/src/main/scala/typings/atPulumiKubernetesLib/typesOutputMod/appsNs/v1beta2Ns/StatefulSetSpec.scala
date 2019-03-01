package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StatefulSetSpec is the specification of a StatefulSet.
  */
trait StatefulSetSpec extends js.Object {
  /**
    * podManagementPolicy controls how pods are created during initial scale up, when replacing
    * pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are
    * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until
    * each pod is ready before continuing. When scaling down, the pods are removed in the
    * opposite order. The alternative policy is `Parallel` which will create pods in parallel to
    * match the desired scale without waiting, and on scale down will delete all pods at once.
    */
  val podManagementPolicy: java.lang.String
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the
    * sense that they are instantiations of the same Template, but individual replicas also have
    * a consistent identity. If unspecified, defaults to 1.
    */
  val replicas: scala.Double
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
    * StatefulSet's revision history. The revision history consists of all revisions not
    * represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  val revisionHistoryLimit: scala.Double
  /**
    * selector is a label query over pods that should match the replica count. It must match the
    * pod template's labels. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must
    * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
    * get DNS/hostnames that follow the pattern:
    * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
    * managed by the StatefulSet controller.
    */
  val serviceName: java.lang.String
  /**
    * template is the object that describes the pod that will be created if insufficient replicas
    * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
    * a unique identity from the rest of the StatefulSet.
    */
  val template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
    * in the StatefulSet when a revision is made to Template.
    */
  val updateStrategy: StatefulSetUpdateStrategy
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
    * StatefulSet controller is responsible for mapping network identities to claims in a way
    * that maintains the identity of a pod. Every claim in this list must have at least one
    * matching (by name) volumeMount in one container in the template. A claim in this list takes
    * precedence over any volumes in the template, with the same name.
    */
  val volumeClaimTemplates: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]
}

object StatefulSetSpec {
  @scala.inline
  def apply(
    podManagementPolicy: java.lang.String,
    replicas: scala.Double,
    revisionHistoryLimit: scala.Double,
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector,
    serviceName: java.lang.String,
    template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec,
    updateStrategy: StatefulSetUpdateStrategy,
    volumeClaimTemplates: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]
  ): StatefulSetSpec = {
    val __obj = js.Dynamic.literal(podManagementPolicy = podManagementPolicy, replicas = replicas, revisionHistoryLimit = revisionHistoryLimit, selector = selector, serviceName = serviceName, template = template, updateStrategy = updateStrategy, volumeClaimTemplates = volumeClaimTemplates)
  
    __obj.asInstanceOf[StatefulSetSpec]
  }
}

