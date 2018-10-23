package com.kevin.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin
 * @date 1/16/2018
 */
public class TreeConvertTools {

    public static List<Node> convertToTree(List<Node> list) {
        //用于存放根结点的Map
        Map<String, Node> rootNodes = new HashMap<>();

        // 用于记录id到结点的映射关系
        Map<String, Node> nodeMap = new HashMap<>(list.size());

        list.forEach(node -> {
            if (rootNodes.containsKey(node.getId())) {
                rootNodes.remove(node.getId());
            }

            if (nodeMap.containsKey(node.getId())) {
                //如果在nodeMap中已存在
                //说明：出现这种情况的原因是其下的子结点优先被遍历到并在nodeMap构造了一个临时结点用于占位
                Node tempNode = nodeMap.get(node.getId());
                node.setChildNodes(tempNode.getChildNodes());
            }

            nodeMap.put(node.getId(), node);

            if (nodeMap.containsKey(node.getPid())) {
                //父结点已存在
                Node parentNode = nodeMap.get(node.getPid());
                parentNode.getChildNodes().add(node);
            } else {
                //构造一个该结点的临时父结点用于占位
                Node tempParentNode = new Node(node.getPid());
                tempParentNode.getChildNodes().add(node);
                nodeMap.put(tempParentNode.getId(), tempParentNode);

                //pid为空的统一放rootNodes，其上没有父结点了
                rootNodes.put(tempParentNode.getId(), tempParentNode);
            }
        });

        List<Node> rootNodeList = new ArrayList<>();
        rootNodes.forEach((k, v) -> rootNodeList.addAll(v.getChildNodes()));

        return rootNodeList;
    }
}
