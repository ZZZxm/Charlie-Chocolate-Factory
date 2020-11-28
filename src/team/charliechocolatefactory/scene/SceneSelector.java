package team.charliechocolatefactory.scene;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname SceneSelector
 * @description Scene Selector. This is a part of Callback pattern.
 * @date 2020/11/25 10:29
 */

public class SceneSelector {

    public static List<Scene> findSubsetSatisfying(List<Scene> scenes, Predicate<Scene> predicate) {

        ArrayList<Scene> sList = new ArrayList<>();

        for (Scene scene : scenes) {
            if (predicate.test(scene)) {
                sList.add(scene);
            }
        }
        return sList;
    }

    private SceneSelector() {

    }
}
