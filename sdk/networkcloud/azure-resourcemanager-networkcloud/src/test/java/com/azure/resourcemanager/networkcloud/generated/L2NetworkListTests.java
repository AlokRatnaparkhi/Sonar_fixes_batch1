// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.L2NetworkInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.L2NetworkList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class L2NetworkListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L2NetworkList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"wzsyyceuzs\",\"value\":[{\"extendedLocation\":{\"name\":\"judpfrxt\",\"type\":\"thzvaytdwkqbrqu\"},\"properties\":{\"clusterId\":\"axhexiilivp\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"r\",\"hybridAksClustersAssociatedIds\":[],\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"axoruzfgsquy\",\"l2IsolationDomainId\":\"xrxxlep\",\"provisioningState\":\"Succeeded\",\"virtualMachinesAssociatedIds\":[]},\"location\":\"jezwlwnw\",\"tags\":{\"atdooaojkniod\":\"lcvydy\",\"bw\":\"oo\"},\"id\":\"ujhemmsbvdkcrodt\",\"name\":\"infwjlfltkacjve\",\"type\":\"kdlfoa\"},{\"extendedLocation\":{\"name\":\"ggkfpagaowpul\",\"type\":\"qblylsyxkqj\"},\"properties\":{\"clusterId\":\"jervtia\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"sz\",\"hybridAksClustersAssociatedIds\":[],\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"bzkfzbeyvpn\",\"l2IsolationDomainId\":\"icvi\",\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[]},\"location\":\"xdxr\",\"tags\":{\"lw\":\"kzclewyh\",\"ofncckwyfzqwhxxb\":\"aztz\",\"xzfe\":\"yq\",\"mncwsobqwcsdb\":\"ztppriolxorjalto\"},\"id\":\"wdcfhucqdpfuv\",\"name\":\"lsbjjcanvxbv\",\"type\":\"vudutncor\"},{\"extendedLocation\":{\"name\":\"r\",\"type\":\"xqtvcofu\"},\"properties\":{\"clusterId\":\"lvkgju\",\"detailedStatus\":\"Provisioning\",\"detailedStatusMessage\":\"nnqvsa\",\"hybridAksClustersAssociatedIds\":[],\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"orudsgsa\",\"l2IsolationDomainId\":\"mkycgra\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[]},\"location\":\"taeburuvdm\",\"tags\":{\"xwabmqoe\":\"mz\"},\"id\":\"kif\",\"name\":\"vtpuqujmqlgk\",\"type\":\"btndo\"},{\"extendedLocation\":{\"name\":\"ongbjcnt\",\"type\":\"jitcjedftwwaez\"},\"properties\":{\"clusterId\":\"jvdcpzfoqouic\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"rzgszufoxci\",\"hybridAksClustersAssociatedIds\":[],\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"oamciodh\",\"l2IsolationDomainId\":\"haz\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[]},\"location\":\"bon\",\"tags\":{\"dwbwhkszzcmrvexz\":\"toego\"},\"id\":\"vbtqgsfraoyzk\",\"name\":\"owtlmnguxawqald\",\"type\":\"yuuximerqfobwyzn\"}]}")
                .toObject(L2NetworkList.class);
        Assertions.assertEquals("wzsyyceuzs", model.nextLink());
        Assertions.assertEquals("jezwlwnw", model.value().get(0).location());
        Assertions.assertEquals("lcvydy", model.value().get(0).tags().get("atdooaojkniod"));
        Assertions.assertEquals("judpfrxt", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("thzvaytdwkqbrqu", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.DPDK, model.value().get(0).hybridAksPluginType());
        Assertions.assertEquals("axoruzfgsquy", model.value().get(0).interfaceName());
        Assertions.assertEquals("xrxxlep", model.value().get(0).l2IsolationDomainId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L2NetworkList model =
            new L2NetworkList()
                .withNextLink("wzsyyceuzs")
                .withValue(
                    Arrays
                        .asList(
                            new L2NetworkInner()
                                .withLocation("jezwlwnw")
                                .withTags(mapOf("atdooaojkniod", "lcvydy", "bw", "oo"))
                                .withExtendedLocation(
                                    new ExtendedLocation().withName("judpfrxt").withType("thzvaytdwkqbrqu"))
                                .withHybridAksPluginType(HybridAksPluginType.DPDK)
                                .withInterfaceName("axoruzfgsquy")
                                .withL2IsolationDomainId("xrxxlep"),
                            new L2NetworkInner()
                                .withLocation("xdxr")
                                .withTags(
                                    mapOf(
                                        "lw",
                                        "kzclewyh",
                                        "ofncckwyfzqwhxxb",
                                        "aztz",
                                        "xzfe",
                                        "yq",
                                        "mncwsobqwcsdb",
                                        "ztppriolxorjalto"))
                                .withExtendedLocation(
                                    new ExtendedLocation().withName("ggkfpagaowpul").withType("qblylsyxkqj"))
                                .withHybridAksPluginType(HybridAksPluginType.SRIOV)
                                .withInterfaceName("bzkfzbeyvpn")
                                .withL2IsolationDomainId("icvi"),
                            new L2NetworkInner()
                                .withLocation("taeburuvdm")
                                .withTags(mapOf("xwabmqoe", "mz"))
                                .withExtendedLocation(new ExtendedLocation().withName("r").withType("xqtvcofu"))
                                .withHybridAksPluginType(HybridAksPluginType.DPDK)
                                .withInterfaceName("orudsgsa")
                                .withL2IsolationDomainId("mkycgra"),
                            new L2NetworkInner()
                                .withLocation("bon")
                                .withTags(mapOf("dwbwhkszzcmrvexz", "toego"))
                                .withExtendedLocation(
                                    new ExtendedLocation().withName("ongbjcnt").withType("jitcjedftwwaez"))
                                .withHybridAksPluginType(HybridAksPluginType.DPDK)
                                .withInterfaceName("oamciodh")
                                .withL2IsolationDomainId("haz")));
        model = BinaryData.fromObject(model).toObject(L2NetworkList.class);
        Assertions.assertEquals("wzsyyceuzs", model.nextLink());
        Assertions.assertEquals("jezwlwnw", model.value().get(0).location());
        Assertions.assertEquals("lcvydy", model.value().get(0).tags().get("atdooaojkniod"));
        Assertions.assertEquals("judpfrxt", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("thzvaytdwkqbrqu", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.DPDK, model.value().get(0).hybridAksPluginType());
        Assertions.assertEquals("axoruzfgsquy", model.value().get(0).interfaceName());
        Assertions.assertEquals("xrxxlep", model.value().get(0).l2IsolationDomainId());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
