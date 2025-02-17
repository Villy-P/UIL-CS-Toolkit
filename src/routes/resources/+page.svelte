<script lang="ts">
	import Markdown from "../../components/Markdown.svelte";

    import resources from './resources.md?raw';
</script>

<div class="flex flex-col gap-4 pt-10 w-11/12 m-auto pb-10">
    <Markdown content={resources}/>
</div>