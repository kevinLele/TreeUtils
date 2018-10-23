package com.kevin.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 1/16/2018.
 */
public class TreeConvertTools {

    public static List<Node> convertToTree(List<Node> list) {
        //用于存放根结点的列表
        List<Node> rootNodeList = new ArrayList<>();

        // 用于记录id到结点的映射关系
        Map<String, Node> nodeMap = new HashMap<>();

        list.forEach(node -> {
            //pid为0的表示为根结构
            if ("0".equals(node.getPid())) {
                //将根结点加入到根结点列表中
                rootNodeList.add(node);

                //如果不存在该根结点的映射关系，则将映射关系保存在map中
                if (!nodeMap.containsKey(node.getId())) {
                    nodeMap.put(node.getId(), node);
                }
            }

            // 如果存在该结点的映射关系则说明它的子结点先于它之前被遍历到，并且虚构了一个父结点，并将映射关系
            // 存放在了map中，此时将虚拟的结点下挂接的子结点读取出来存放在真实的父结点啊
            if (nodeMap.containsKey(node.getId())) {
                Node temp = nodeMap.get(node.getId());

                node.getChildNodes().addAll(temp.getChildNodes());
                nodeMap.put(node.getId(), node);
            }

            if (nodeMap.containsKey(node.getPid())) {
                Node parent = nodeMap.get(node.getPid());
                parent.getChildNodes().add(node);
            } else {
                // 虚拟一个父结点，并将当前结点挂接在该父结点下
                Node parent = new Node();
                parent.setId(node.getPid());
                parent.getChildNodes().add(node);

                nodeMap.put(parent.getId(), parent);
            }
        });

        return rootNodeList;
    }

    public static List<Option> toTreeString(List<Node> rootNodeList) {
        List<Option> options = new ArrayList<>();

        for (Node node : rootNodeList) {
            options.addAll(toNodeString(node, 0));
        }

        return options;
    }

    private static List<Option> toNodeString(Node node, int level) {
        List<Option> options = new ArrayList<>();
        StringBuffer strBuffer = new StringBuffer();

        for (int num = 0; num < level - 1; num++) {
            strBuffer.append("  ");
        }

        if (level > 0) {
            strBuffer.append("  |-");
        }

        strBuffer.append(node.getName());
        options.add(new Option(strBuffer.toString(), node.getValue()));

        if (node.getChildNodes().size() > 0) {
            for (Node childNode : node.getChildNodes()) {
                options.addAll(toNodeString(childNode, level + 1));
            }
        }

        return options;
    }
}
