package team.charliechocolatefactory.scene;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname SceneStructure
 * @description collect scenes for visitor pattern
 * @date 2020/11/18 16:52
 */
public class SceneStructure {

    /**
     * all scenes in the factory
     */
    private List<Scene> scenes;

    /**
     * constructor of the class SceneStructure
     */
    public SceneStructure() {
        scenes = new ArrayList<Scene>();
    }

    /**
     * Add a scene to the collection list
     *
     * @param s new scene object
     */
    public void addScene(Scene s) {
        scenes.add(s);
    }

    /**
     * worker maintains all scenes in the list
     *
     * @param worker the worker to maintain the scene
     */
    public void accept(UtilityWorker worker) {
        for (Object obj : scenes) {
            ((Scene) obj).accept(worker);
        }
    }

    /**
     * get a scene object from the scene list by its name
     *
     * @param name name of the scene to be found
     * @return object of the scene found (return null if not found)
     */
    public Scene getSceneByName(String name) {
        for (Scene item : scenes) {
            if (item.toString().equals(name)) {
                return item;
            }
        }
        return null;
    }

}
